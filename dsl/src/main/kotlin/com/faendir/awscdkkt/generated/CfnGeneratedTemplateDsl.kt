package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnGeneratedTemplate
import software.amazon.awscdk.CfnGeneratedTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGeneratedTemplate(
  id: String,
  props: CfnGeneratedTemplateProps,
  initializer: @AwsCdkDsl CfnGeneratedTemplate.() -> Unit = {},
): CfnGeneratedTemplate = CfnGeneratedTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGeneratedTemplate(id: String, initializer: @AwsCdkDsl CfnGeneratedTemplate.Builder.() -> Unit = {}): CfnGeneratedTemplate = CfnGeneratedTemplate.Builder.create(this, id).apply(initializer).build()
