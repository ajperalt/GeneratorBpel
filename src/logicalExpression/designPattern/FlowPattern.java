package logicalExpression.designPattern;

import logicalSpecification.patterns.PatternFormulaMap;
import org.w3c.dom.Element;

public class FlowPattern extends BaseDesignPattern {
    
    public FlowPattern(Element mainNode) {        
        this.designPatternType = DesignPatternType.Flow;
        this.name = mainNode.getAttribute("name");
        patternParams = PatternFormulaMap.getInstance().get(designPatternType);
    }
    
    @Override
    public StringBuilder printLogicalSpecification() {
        StringBuilder result = new StringBuilder();
        
        return result;
    }
}