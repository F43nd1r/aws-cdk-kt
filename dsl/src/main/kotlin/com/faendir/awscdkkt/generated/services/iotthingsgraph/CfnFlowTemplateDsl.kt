package com.faendir.awscdkkt.generated.services.iotthingsgraph

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowTemplate(
  id: String,
  props: CfnFlowTemplateProps,
  initializer: @AwsCdkDsl CfnFlowTemplate.() -> Unit = {},
): CfnFlowTemplate = CfnFlowTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlowTemplate(id: String, initializer: @AwsCdkDsl
    CfnFlowTemplate.Builder.() -> Unit = {}): CfnFlowTemplate = CfnFlowTemplate.Builder.create(this,
    id).apply(initializer).build()
