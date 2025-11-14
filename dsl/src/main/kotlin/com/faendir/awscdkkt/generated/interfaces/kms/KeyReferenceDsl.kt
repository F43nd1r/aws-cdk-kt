package com.faendir.awscdkkt.generated.interfaces.kms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.interfaces.kms.KeyReference

@Generated
public fun buildKeyReference(initializer: @AwsCdkDsl KeyReference.Builder.() -> Unit = {}): KeyReference = KeyReference.Builder().apply(initializer).build()
