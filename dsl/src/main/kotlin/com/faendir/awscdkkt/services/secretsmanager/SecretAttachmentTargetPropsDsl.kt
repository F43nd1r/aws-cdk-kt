package com.faendir.awscdkkt.services.secretsmanager

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps

@Generated
public fun secretAttachmentTargetProps(initializer: SecretAttachmentTargetProps.Builder.() -> Unit =
    {}): SecretAttachmentTargetProps =
    SecretAttachmentTargetProps.builder().apply(initializer).build()
