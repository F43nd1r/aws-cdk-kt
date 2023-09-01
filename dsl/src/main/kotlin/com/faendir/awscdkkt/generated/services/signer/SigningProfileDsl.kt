package com.faendir.awscdkkt.generated.services.signer

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.signer.SigningProfile
import software.amazon.awscdk.services.signer.SigningProfileProps
import software.constructs.Construct

@Generated
public fun Construct.signingProfile(
  id: String,
  props: SigningProfileProps,
  initializer: @AwsCdkDsl SigningProfile.() -> Unit = {},
): SigningProfile = SigningProfile(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSigningProfile(id: String, initializer: @AwsCdkDsl
    SigningProfile.Builder.() -> Unit = {}): SigningProfile = SigningProfile.Builder.create(this,
    id).apply(initializer).build()
