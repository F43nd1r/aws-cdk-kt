package com.faendir.awscdkkt.services.ssm

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnDocument

@Generated
public
    fun attachmentsSourceProperty(initializer: CfnDocument.AttachmentsSourceProperty.Builder.() -> Unit
    = {}): CfnDocument.AttachmentsSourceProperty =
    CfnDocument.AttachmentsSourceProperty.builder().apply(initializer).build()
