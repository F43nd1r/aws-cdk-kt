@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnTemplate
import software.amazon.awscdk.services.ses.CfnTemplateProps
import software.constructs.Construct

public fun Construct.cfnTemplate(
  id: String,
  props: CfnTemplateProps,
  initializer: CfnTemplate.() -> Unit = {},
): CfnTemplate = CfnTemplate(this, id, props).apply(initializer)

public fun Construct.cfnTemplate(id: String, initializer: CfnTemplate.() -> Unit = {}): CfnTemplate
    = CfnTemplate(this, id).apply(initializer)
