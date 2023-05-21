package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBInstance

@Generated
public
    fun certificateDetailsProperty(initializer: CfnDBInstance.CertificateDetailsProperty.Builder.() -> Unit
    = {}): CfnDBInstance.CertificateDetailsProperty =
    CfnDBInstance.CertificateDetailsProperty.builder().apply(initializer).build()
