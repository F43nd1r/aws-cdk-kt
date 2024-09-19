package com.faendir.awscdkkt.generated.services.medialive

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplate
import software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventBridgeRuleTemplate(
  id: String,
  props: CfnEventBridgeRuleTemplateProps,
  initializer: @AwsCdkDsl CfnEventBridgeRuleTemplate.() -> Unit = {},
): CfnEventBridgeRuleTemplate = CfnEventBridgeRuleTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEventBridgeRuleTemplate(id: String, initializer: @AwsCdkDsl
    CfnEventBridgeRuleTemplate.Builder.() -> Unit = {}): CfnEventBridgeRuleTemplate =
    CfnEventBridgeRuleTemplate.Builder.create(this, id).apply(initializer).build()
