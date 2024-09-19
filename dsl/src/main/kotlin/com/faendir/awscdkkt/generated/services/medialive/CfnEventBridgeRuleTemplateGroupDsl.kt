package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroup
import software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventBridgeRuleTemplateGroup(
  id: String,
  props: CfnEventBridgeRuleTemplateGroupProps,
  initializer: @AwsCdkDsl CfnEventBridgeRuleTemplateGroup.() -> Unit = {},
): CfnEventBridgeRuleTemplateGroup = CfnEventBridgeRuleTemplateGroup(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnEventBridgeRuleTemplateGroup(id: String, initializer: @AwsCdkDsl
    CfnEventBridgeRuleTemplateGroup.Builder.() -> Unit = {}): CfnEventBridgeRuleTemplateGroup =
    CfnEventBridgeRuleTemplateGroup.Builder.create(this, id).apply(initializer).build()
