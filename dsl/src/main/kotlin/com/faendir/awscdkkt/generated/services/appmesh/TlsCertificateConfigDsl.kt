package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TlsCertificateConfig

@Generated
public fun buildTlsCertificateConfig(initializer: @AwsCdkDsl TlsCertificateConfig.Builder.() -> Unit
    = {}): TlsCertificateConfig = TlsCertificateConfig.Builder().apply(initializer).build()
