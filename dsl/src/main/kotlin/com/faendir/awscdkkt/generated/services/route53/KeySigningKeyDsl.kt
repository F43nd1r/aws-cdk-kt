package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.KeySigningKey
import software.amazon.awscdk.services.route53.KeySigningKeyProps
import software.constructs.Construct

@Generated
public fun Construct.keySigningKey(
  id: String,
  props: KeySigningKeyProps,
  initializer: @AwsCdkDsl KeySigningKey.() -> Unit = {},
): KeySigningKey = KeySigningKey(this, id, props).apply(initializer)

@Generated
public fun Construct.buildKeySigningKey(id: String, initializer: @AwsCdkDsl
    KeySigningKey.Builder.() -> Unit = {}): KeySigningKey = KeySigningKey.Builder.create(this,
    id).apply(initializer).build()
