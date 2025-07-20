package com.faendir.awscdkkt.generated.services.kms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kms.Alias
import software.amazon.awscdk.services.kms.AliasProps
import software.constructs.Construct

@Generated
public fun Construct.alias(
  id: String,
  props: AliasProps,
  initializer: @AwsCdkDsl Alias.() -> Unit = {},
): Alias = Alias(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAlias(id: String, initializer: @AwsCdkDsl Alias.Builder.() -> Unit = {}): Alias = Alias.Builder.create(this, id).apply(initializer).build()
