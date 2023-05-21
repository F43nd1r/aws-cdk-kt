package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnThingPrincipalAttachment(
  id: String,
  props: CfnThingPrincipalAttachmentProps,
  initializer: CfnThingPrincipalAttachment.() -> Unit = {},
): CfnThingPrincipalAttachment = CfnThingPrincipalAttachment(this, id, props).apply(initializer)
