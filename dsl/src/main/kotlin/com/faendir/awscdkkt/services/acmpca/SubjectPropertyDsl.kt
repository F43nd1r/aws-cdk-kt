package com.faendir.awscdkkt.services.acmpca

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.acmpca.CfnCertificateAuthority

@Generated
public fun subjectProperty(initializer: CfnCertificateAuthority.SubjectProperty.Builder.() -> Unit =
    {}): CfnCertificateAuthority.SubjectProperty =
    CfnCertificateAuthority.SubjectProperty.builder().apply(initializer).build()
