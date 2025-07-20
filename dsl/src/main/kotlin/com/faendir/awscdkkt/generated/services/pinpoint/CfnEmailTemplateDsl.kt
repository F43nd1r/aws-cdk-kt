package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplate
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEmailTemplate(
  id: String,
  props: CfnEmailTemplateProps,
  initializer: @AwsCdkDsl CfnEmailTemplate.() -> Unit = {},
): CfnEmailTemplate = CfnEmailTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEmailTemplate(id: String, initializer: @AwsCdkDsl CfnEmailTemplate.Builder.() -> Unit = {}): CfnEmailTemplate = CfnEmailTemplate.Builder.create(this, id).apply(initializer).build()
