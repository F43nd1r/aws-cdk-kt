@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps
import software.constructs.Construct

public fun Construct.cfnThingPrincipalAttachment(
  id: String,
  props: CfnThingPrincipalAttachmentProps,
  initializer: CfnThingPrincipalAttachment.() -> Unit = {},
): CfnThingPrincipalAttachment = CfnThingPrincipalAttachment(this, id, props).apply(initializer)
