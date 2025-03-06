package com.faendir.awscdkkt.generated.services.opensearchservice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.NodeConfig

@Generated
public fun buildNodeConfig(initializer: @AwsCdkDsl NodeConfig.Builder.() -> Unit = {}): NodeConfig =
    NodeConfig.Builder().apply(initializer).build()
