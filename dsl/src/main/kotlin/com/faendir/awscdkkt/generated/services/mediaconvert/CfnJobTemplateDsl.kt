package com.faendir.awscdkkt.generated.services.mediaconvert

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnJobTemplate(
  id: String,
  props: CfnJobTemplateProps,
  initializer: @AwsCdkDsl CfnJobTemplate.() -> Unit = {},
): CfnJobTemplate = CfnJobTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnJobTemplate(id: String, initializer: @AwsCdkDsl CfnJobTemplate.Builder.() -> Unit = {}): CfnJobTemplate = CfnJobTemplate.Builder.create(this, id).apply(initializer).build()
