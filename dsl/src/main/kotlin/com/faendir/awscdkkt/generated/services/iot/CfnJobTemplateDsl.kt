package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate
import software.amazon.awscdk.services.iot.CfnJobTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnJobTemplate(id: String, props: CfnJobTemplateProps): CfnJobTemplate =
    CfnJobTemplate(this, id, props)

@Generated
public fun Construct.cfnJobTemplate(
  id: String,
  props: CfnJobTemplateProps,
  initializer: @AwsCdkDsl CfnJobTemplate.() -> Unit,
): CfnJobTemplate = CfnJobTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnJobTemplate(id: String, initializer: @AwsCdkDsl
    CfnJobTemplate.Builder.() -> Unit): CfnJobTemplate = CfnJobTemplate.Builder.create(this,
    id).apply(initializer).build()
