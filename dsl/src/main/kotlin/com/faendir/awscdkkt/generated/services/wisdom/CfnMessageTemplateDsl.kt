package com.faendir.awscdkkt.generated.services.wisdom

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wisdom.CfnMessageTemplate
import software.amazon.awscdk.services.wisdom.CfnMessageTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMessageTemplate(
  id: String,
  props: CfnMessageTemplateProps,
  initializer: @AwsCdkDsl CfnMessageTemplate.() -> Unit = {},
): CfnMessageTemplate = CfnMessageTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMessageTemplate(id: String, initializer: @AwsCdkDsl CfnMessageTemplate.Builder.() -> Unit = {}): CfnMessageTemplate = CfnMessageTemplate.Builder.create(this, id).apply(initializer).build()
