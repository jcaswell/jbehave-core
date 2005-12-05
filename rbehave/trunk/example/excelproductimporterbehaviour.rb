require 'rbehave/core' # rbehave

# domain classes
require 'example/vendorwriter'
require 'example/excelproductimporter'
require 'rexml/document'

include RBehave

class ExcelProductImporterBehaviour

  include Constraints
  include Verifiers
  
  def should_write_vendor_entry
    # given...
    xml = REXML::Document.new <<-END
      <Worksheet>
        <Row>
          <Cell>BrassCorp</Cell>
          <Cell>trumpet</Cell>
          <Cell>brass</Cell>
        </Row>
      </Worksheet>
    END
    
    vendor_writer = verifier_for(VendorWriter)
    
    product_importer = ExcelProductImporter.new(vendor_writer)
    
    # expect...
    vendor_writer.__should_receive { |obj|
      obj.write(eq(1), 'BrassCorp')
    }
    
    # when...
    product_importer.import(xml)
    
    ensure_that xml, contains("BrassCorp")
  end
end