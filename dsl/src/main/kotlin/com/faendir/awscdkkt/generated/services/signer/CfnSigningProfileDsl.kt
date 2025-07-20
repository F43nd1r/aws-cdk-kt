package com.faendir.awscdkkt.generated.services.signer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.signer.CfnSigningProfile
import software.amazon.awscdk.services.signer.CfnSigningProfileProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSigningProfile(
  id: String,
  props: CfnSigningProfileProps,
  initializer: @AwsCdkDsl CfnSigningProfile.() -> Unit = {},
): CfnSigningProfile = CfnSigningProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSigningProfile(id: String, initializer: @AwsCdkDsl CfnSigningProfile.Builder.() -> Unit = {}): CfnSigningProfile = CfnSigningProfile.Builder.create(this, id).apply(initializer).build()
