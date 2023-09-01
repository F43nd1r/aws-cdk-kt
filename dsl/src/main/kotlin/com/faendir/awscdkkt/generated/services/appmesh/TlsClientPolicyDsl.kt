package com.faendir.awscdkkt.generated.services.appmesh

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.TlsClientPolicy

@Generated
public fun buildTlsClientPolicy(initializer: @AwsCdkDsl TlsClientPolicy.Builder.() -> Unit = {}):
    TlsClientPolicy = TlsClientPolicy.Builder().apply(initializer).build()
