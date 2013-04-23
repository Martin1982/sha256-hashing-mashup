import qualified Data.ByteString.Char8 as B
import Crypto.Hash

main = do
    let b = B.pack "Enter values here"
    putStrLn $ show (hash b :: Digest SHA256)
