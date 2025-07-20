package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.PublicKey
import software.amazon.awscdk.services.cloudfront.PublicKeyProps
import software.constructs.Construct

@Generated
public fun Construct.publicKey(
  id: String,
  props: PublicKeyProps,
  initializer: @AwsCdkDsl PublicKey.() -> Unit = {},
): PublicKey = PublicKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPublicKey(id: String, initializer: @AwsCdkDsl PublicKey.Builder.() -> Unit = {}): PublicKey = PublicKey.Builder.create(this, id).apply(initializer).build()
