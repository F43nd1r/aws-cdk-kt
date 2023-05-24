package com.faendir.awscdkkt.generated.customresources

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.customresources.Provider
import software.amazon.awscdk.customresources.ProviderProps
import software.constructs.Construct

@Generated
public fun Construct.provider(id: String, props: ProviderProps): Provider = Provider(this, id,
    props)

@Generated
public fun Construct.provider(
  id: String,
  props: ProviderProps,
  initializer: @AwsCdkDsl Provider.() -> Unit,
): Provider = Provider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildProvider(id: String, initializer: @AwsCdkDsl Provider.Builder.() -> Unit):
    Provider = Provider.Builder.create(this, id).apply(initializer).build()
