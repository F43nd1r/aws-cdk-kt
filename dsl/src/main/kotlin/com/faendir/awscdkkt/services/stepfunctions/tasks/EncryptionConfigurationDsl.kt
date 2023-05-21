package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EncryptionConfiguration

@Generated
public fun encryptionConfiguration(initializer: EncryptionConfiguration.Builder.() -> Unit = {}):
    EncryptionConfiguration = EncryptionConfiguration.builder().apply(initializer).build()
