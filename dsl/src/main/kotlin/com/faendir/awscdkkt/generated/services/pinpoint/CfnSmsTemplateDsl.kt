package com.faendir.awscdkkt.generated.services.pinpoint

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplate
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSmsTemplate(
  id: String,
  props: CfnSmsTemplateProps,
  initializer: @AwsCdkDsl CfnSmsTemplate.() -> Unit = {},
): CfnSmsTemplate = CfnSmsTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSmsTemplate(id: String, initializer: @AwsCdkDsl
    CfnSmsTemplate.Builder.() -> Unit = {}): CfnSmsTemplate = CfnSmsTemplate.Builder.create(this,
    id).apply(initializer).build()
