package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps

@Generated
public fun secretTargetAttachmentProps(initializer: SecretTargetAttachmentProps.Builder.() -> Unit =
    {}): SecretTargetAttachmentProps =
    SecretTargetAttachmentProps.builder().apply(initializer).build()
