package com.faendir.awscdkkt.generated.services.guardduty

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.guardduty.CfnCustomDetectionRuleAssociation
import software.amazon.awscdk.services.guardduty.CfnCustomDetectionRuleAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomDetectionRuleAssociation(
  id: String,
  props: CfnCustomDetectionRuleAssociationProps,
  initializer: @AwsCdkDsl CfnCustomDetectionRuleAssociation.() -> Unit = {},
): CfnCustomDetectionRuleAssociation = CfnCustomDetectionRuleAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomDetectionRuleAssociation(id: String, initializer: @AwsCdkDsl CfnCustomDetectionRuleAssociation.Builder.() -> Unit = {}): CfnCustomDetectionRuleAssociation = CfnCustomDetectionRuleAssociation.Builder.create(this, id).apply(initializer).build()
