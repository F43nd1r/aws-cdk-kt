package com.faendir.awscdkkt.generated.services.iot

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnThingPrincipalAttachment(id: String,
    props: CfnThingPrincipalAttachmentProps): CfnThingPrincipalAttachment =
    CfnThingPrincipalAttachment(this, id, props)

@Generated
public fun Construct.cfnThingPrincipalAttachment(
  id: String,
  props: CfnThingPrincipalAttachmentProps,
  initializer: @AwsCdkDsl CfnThingPrincipalAttachment.() -> Unit,
): CfnThingPrincipalAttachment = CfnThingPrincipalAttachment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnThingPrincipalAttachment(id: String, initializer: @AwsCdkDsl
    CfnThingPrincipalAttachment.Builder.() -> Unit): CfnThingPrincipalAttachment =
    CfnThingPrincipalAttachment.Builder.create(this, id).apply(initializer).build()
