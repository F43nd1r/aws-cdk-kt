package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnPipeline

@Generated
public fun encryptionKeyProperty(initializer: CfnPipeline.EncryptionKeyProperty.Builder.() -> Unit =
    {}): CfnPipeline.EncryptionKeyProperty =
    CfnPipeline.EncryptionKeyProperty.builder().apply(initializer).build()
