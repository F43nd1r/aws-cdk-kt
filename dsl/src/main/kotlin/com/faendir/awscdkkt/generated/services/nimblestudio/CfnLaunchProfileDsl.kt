package com.faendir.awscdkkt.generated.services.nimblestudio

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLaunchProfile(id: String, props: CfnLaunchProfileProps): CfnLaunchProfile =
    CfnLaunchProfile(this, id, props)

@Generated
public fun Construct.cfnLaunchProfile(
  id: String,
  props: CfnLaunchProfileProps,
  initializer: @AwsCdkDsl CfnLaunchProfile.() -> Unit,
): CfnLaunchProfile = CfnLaunchProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLaunchProfile(id: String, initializer: @AwsCdkDsl
    CfnLaunchProfile.Builder.() -> Unit): CfnLaunchProfile = CfnLaunchProfile.Builder.create(this,
    id).apply(initializer).build()
