package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.KeyGroup
import software.amazon.awscdk.services.cloudfront.KeyGroupProps
import software.constructs.Construct

@Generated
public fun Construct.keyGroup(id: String, props: KeyGroupProps): KeyGroup = KeyGroup(this, id,
    props)

@Generated
public fun Construct.keyGroup(
  id: String,
  props: KeyGroupProps,
  initializer: @AwsCdkDsl KeyGroup.() -> Unit,
): KeyGroup = KeyGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildKeyGroup(id: String, initializer: @AwsCdkDsl KeyGroup.Builder.() -> Unit):
    KeyGroup = KeyGroup.Builder.create(this, id).apply(initializer).build()
