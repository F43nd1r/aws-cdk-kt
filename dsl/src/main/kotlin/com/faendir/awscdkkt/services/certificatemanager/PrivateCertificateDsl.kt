@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.certificatemanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.certificatemanager.PrivateCertificate
import software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps
import software.constructs.Construct

public fun Construct.privateCertificate(
  id: String,
  props: PrivateCertificateProps,
  initializer: PrivateCertificate.() -> Unit = {},
): PrivateCertificate = PrivateCertificate(this, id, props).apply(initializer)
