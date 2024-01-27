package com.faendir.awscdkkt.generated.services.ssmguiconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmguiconnect.CfnPreferences
import software.amazon.awscdk.services.ssmguiconnect.CfnPreferencesProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPreferences(id: String, initializer: @AwsCdkDsl CfnPreferences.() -> Unit =
    {}): CfnPreferences = CfnPreferences(this, id).apply(initializer)

@Generated
public fun Construct.cfnPreferences(
  id: String,
  props: CfnPreferencesProps,
  initializer: @AwsCdkDsl CfnPreferences.() -> Unit = {},
): CfnPreferences = CfnPreferences(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPreferences(id: String, initializer: @AwsCdkDsl
    CfnPreferences.Builder.() -> Unit = {}): CfnPreferences = CfnPreferences.Builder.create(this,
    id).apply(initializer).build()
