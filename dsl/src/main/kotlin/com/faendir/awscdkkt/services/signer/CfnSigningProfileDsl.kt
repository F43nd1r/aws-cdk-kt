package com.faendir.awscdkkt.services.signer

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
  initializer: CfnSigningProfile.() -> Unit = {},
): CfnSigningProfile = CfnSigningProfile(this, id, props).apply(initializer)
