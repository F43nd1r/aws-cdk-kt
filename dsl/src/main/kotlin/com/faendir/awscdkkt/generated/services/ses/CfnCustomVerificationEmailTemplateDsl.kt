package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnCustomVerificationEmailTemplate
import software.amazon.awscdk.services.ses.CfnCustomVerificationEmailTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCustomVerificationEmailTemplate(
  id: String,
  props: CfnCustomVerificationEmailTemplateProps,
  initializer: @AwsCdkDsl CfnCustomVerificationEmailTemplate.() -> Unit = {},
): CfnCustomVerificationEmailTemplate = CfnCustomVerificationEmailTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCustomVerificationEmailTemplate(id: String, initializer: @AwsCdkDsl CfnCustomVerificationEmailTemplate.Builder.() -> Unit = {}): CfnCustomVerificationEmailTemplate = CfnCustomVerificationEmailTemplate.Builder.create(this, id).apply(initializer).build()
