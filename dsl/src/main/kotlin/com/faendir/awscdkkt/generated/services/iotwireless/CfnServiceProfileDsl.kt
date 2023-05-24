package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnServiceProfile
import software.amazon.awscdk.services.iotwireless.CfnServiceProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceProfile(id: String, props: CfnServiceProfileProps): CfnServiceProfile
    = CfnServiceProfile(this, id, props)

@Generated
public fun Construct.cfnServiceProfile(
  id: String,
  props: CfnServiceProfileProps,
  initializer: @AwsCdkDsl CfnServiceProfile.() -> Unit,
): CfnServiceProfile = CfnServiceProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnServiceProfile(id: String): CfnServiceProfile = CfnServiceProfile(this, id)

@Generated
public fun Construct.cfnServiceProfile(id: String, initializer: @AwsCdkDsl
    CfnServiceProfile.() -> Unit): CfnServiceProfile = CfnServiceProfile(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnServiceProfile(id: String, initializer: @AwsCdkDsl
    CfnServiceProfile.Builder.() -> Unit): CfnServiceProfile =
    CfnServiceProfile.Builder.create(this, id).apply(initializer).build()
