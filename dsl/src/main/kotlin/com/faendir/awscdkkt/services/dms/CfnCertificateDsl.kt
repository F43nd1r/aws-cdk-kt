@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnCertificate
import software.amazon.awscdk.services.dms.CfnCertificateProps
import software.constructs.Construct

public fun Construct.cfnCertificate(id: String, initializer: CfnCertificate.() -> Unit = {}):
    CfnCertificate = CfnCertificate(this, id).apply(initializer)

public fun Construct.cfnCertificate(
  id: String,
  props: CfnCertificateProps,
  initializer: CfnCertificate.() -> Unit = {},
): CfnCertificate = CfnCertificate(this, id, props).apply(initializer)
