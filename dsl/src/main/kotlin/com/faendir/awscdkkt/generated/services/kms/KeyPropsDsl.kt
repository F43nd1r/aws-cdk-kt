package com.faendir.awscdkkt.generated.services.kms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.KeyProps

@Generated
public fun buildKeyProps(initializer: @AwsCdkDsl KeyProps.Builder.() -> Unit = {}): KeyProps =
    KeyProps.Builder().apply(initializer).build()
