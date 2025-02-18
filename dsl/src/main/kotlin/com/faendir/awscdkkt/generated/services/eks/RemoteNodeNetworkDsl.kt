package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.RemoteNodeNetwork

@Generated
public fun buildRemoteNodeNetwork(initializer: @AwsCdkDsl RemoteNodeNetwork.Builder.() -> Unit =
    {}): RemoteNodeNetwork = RemoteNodeNetwork.Builder().apply(initializer).build()
