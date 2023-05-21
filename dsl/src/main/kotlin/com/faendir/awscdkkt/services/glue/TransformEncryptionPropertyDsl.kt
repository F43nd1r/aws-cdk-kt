package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnMLTransform

@Generated
public
    fun transformEncryptionProperty(initializer: CfnMLTransform.TransformEncryptionProperty.Builder.() -> Unit
    = {}): CfnMLTransform.TransformEncryptionProperty =
    CfnMLTransform.TransformEncryptionProperty.builder().apply(initializer).build()
