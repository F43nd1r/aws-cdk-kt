@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

public
    fun certificateDetailsProperty(initializer: CfnDBInstance.CertificateDetailsProperty.Builder.() -> Unit):
    CfnDBInstance.CertificateDetailsProperty =
    CfnDBInstance.CertificateDetailsProperty.builder().apply(initializer).build()
