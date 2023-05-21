package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps

@Generated
public
    fun cfnSecretTargetAttachmentProps(initializer: CfnSecretTargetAttachmentProps.Builder.() -> Unit
    = {}): CfnSecretTargetAttachmentProps =
    CfnSecretTargetAttachmentProps.builder().apply(initializer).build()
