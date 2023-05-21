package com.faendir.awscdkkt.services.appmesh

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TlsCertificateConfig

@Generated
public fun tlsCertificateConfig(initializer: TlsCertificateConfig.Builder.() -> Unit = {}):
    TlsCertificateConfig = TlsCertificateConfig.builder().apply(initializer).build()
