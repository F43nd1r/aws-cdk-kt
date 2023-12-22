package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.KeyPair
import software.amazon.awscdk.services.ec2.KeyPairProps
import software.constructs.Construct

@Generated
public fun Construct.keyPair(id: String, initializer: @AwsCdkDsl KeyPair.() -> Unit = {}): KeyPair =
    KeyPair(this, id).apply(initializer)

@Generated
public fun Construct.keyPair(
  id: String,
  props: KeyPairProps,
  initializer: @AwsCdkDsl KeyPair.() -> Unit = {},
): KeyPair = KeyPair(this, id, props).apply(initializer)

@Generated
public fun Construct.buildKeyPair(id: String, initializer: @AwsCdkDsl KeyPair.Builder.() -> Unit =
    {}): KeyPair = KeyPair.Builder.create(this, id).apply(initializer).build()
