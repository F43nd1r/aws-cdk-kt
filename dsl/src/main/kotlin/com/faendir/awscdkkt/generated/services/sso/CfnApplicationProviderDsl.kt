package com.faendir.awscdkkt.generated.services.sso

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sso.CfnApplicationProvider
import software.amazon.awscdk.services.sso.CfnApplicationProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationProvider(id: String, initializer: @AwsCdkDsl CfnApplicationProvider.() -> Unit = {}): CfnApplicationProvider = CfnApplicationProvider(this, id).apply(initializer)

@Generated
public fun Construct.cfnApplicationProvider(
  id: String,
  props: CfnApplicationProviderProps,
  initializer: @AwsCdkDsl CfnApplicationProvider.() -> Unit = {},
): CfnApplicationProvider = CfnApplicationProvider(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationProvider(id: String, initializer: @AwsCdkDsl CfnApplicationProvider.Builder.() -> Unit = {}): CfnApplicationProvider = CfnApplicationProvider.Builder.create(this, id).apply(initializer).build()
