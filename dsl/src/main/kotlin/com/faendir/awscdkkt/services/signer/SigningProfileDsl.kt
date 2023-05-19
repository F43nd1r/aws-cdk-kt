@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.signer

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.signer.SigningProfile
import software.amazon.awscdk.services.signer.SigningProfileProps
import software.constructs.Construct

public fun Construct.signingProfile(
  id: String,
  props: SigningProfileProps,
  initializer: SigningProfile.() -> Unit = {},
): SigningProfile = SigningProfile(this, id, props).apply(initializer)
