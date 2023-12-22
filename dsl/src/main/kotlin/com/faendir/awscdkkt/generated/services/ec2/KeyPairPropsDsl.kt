package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.KeyPairProps

@Generated
public fun buildKeyPairProps(initializer: @AwsCdkDsl KeyPairProps.Builder.() -> Unit = {}):
    KeyPairProps = KeyPairProps.Builder().apply(initializer).build()
