package com.faendir.awscdkkt.generated.services.connect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnTaskTemplate
import software.amazon.awscdk.services.connect.CfnTaskTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTaskTemplate(
  id: String,
  props: CfnTaskTemplateProps,
  initializer: @AwsCdkDsl CfnTaskTemplate.() -> Unit = {},
): CfnTaskTemplate = CfnTaskTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTaskTemplate(id: String, initializer: @AwsCdkDsl
    CfnTaskTemplate.Builder.() -> Unit = {}): CfnTaskTemplate = CfnTaskTemplate.Builder.create(this,
    id).apply(initializer).build()
