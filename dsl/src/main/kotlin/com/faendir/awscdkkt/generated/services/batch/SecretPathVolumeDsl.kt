package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.SecretPathVolume

@Generated
public fun buildSecretPathVolume(initializer: @AwsCdkDsl SecretPathVolume.Builder.() -> Unit = {}):
    SecretPathVolume = SecretPathVolume.Builder.create().apply(initializer).build()
