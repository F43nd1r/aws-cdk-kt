package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.RemotePodNetwork

@Generated
public fun buildRemotePodNetwork(initializer: @AwsCdkDsl RemotePodNetwork.Builder.() -> Unit = {}):
    RemotePodNetwork = RemotePodNetwork.Builder().apply(initializer).build()
